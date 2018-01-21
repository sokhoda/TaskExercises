import domain.Address;
import domain.StudentExtended;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MarshalRunner {
    public static void main(String[] args) throws IOException {
        String fileName = "studentOut.xml";
        MarshalRunner marshalRunner = new MarshalRunner();

        marshalRunner.marshal();

        StudentExtended student = marshalRunner.unmarshal(fileName);
        System.out.println(student);
    }

    private void marshal() throws IOException {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(StudentExtended.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            File file = new File("jsontree\\src\\main\\resources\\studentOut.xml");
            FileOutputStream fos = new FileOutputStream(file);
            StudentExtended studentExtended = StudentExtended.builder()
                    .age(11)
                    .build();

            marshaller.marshal(studentExtended, fos );
            fos.close();
        } catch (JAXBException e) {
            throw new RuntimeException("Can't parse xml file", e);
        }

    }

    private StudentExtended unmarshal(String fileName) {
        Unmarshaller unmarshaller;
        //Get file from resources folder
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());


        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(StudentExtended.class);
            unmarshaller = jaxbContext.createUnmarshaller();
            return unmarshaller.unmarshal(new StreamSource(file), StudentExtended.class).getValue();
        } catch (JAXBException e) {
            throw new RuntimeException("Can't parse xml file", e);
        }
    }
}
