import com.google.common.collect.Lists;
import domain.Address;
import domain.Student;
import domain.StudentExtended;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.URI;

public class MarshalRunner {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "student.xml";
        StudentExtended student = new MarshalRunner().unmarshal(fileName);
        System.out.println(student);
        marshal();
    }

    private static void marshal() throws FileNotFoundException {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(StudentExtended.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            FileOutputStream fos = new FileOutputStream("StudentOut.xml");
            StudentExtended studentExtended = StudentExtended.builder()
                    .age(11)
                    .marks(new int[]{})
                    .name("som")
                    .address(new Address("ct","str"))
                    .build();

            marshaller.marshal(studentExtended, fos );
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
