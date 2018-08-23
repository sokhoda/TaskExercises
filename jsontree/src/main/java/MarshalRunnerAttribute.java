import domain.StudentExtended;
import domain.StudentExtendedAttribute;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MarshalRunnerAttribute {
    public static void main(String[] args) throws IOException, JAXBException {
        String fileName = "studentOut_versao.xml";
        MarshalRunnerAttribute marshalRunner = new MarshalRunnerAttribute();

        StudentExtendedAttribute student = marshalRunner.unmarshal(fileName);
        System.out.println(student);
    }

    private StudentExtendedAttribute unmarshal(String fileName) {
        Unmarshaller unmarshaller;
        //Get file from resources folder
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());


        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(StudentExtendedAttribute.class);
            unmarshaller = jaxbContext.createUnmarshaller();
            return unmarshaller.unmarshal(new StreamSource(file), StudentExtendedAttribute.class).getValue();
        } catch (JAXBException e) {
            throw new RuntimeException("Can't parse xml file", e);
        }
    }

    private void createScheme() throws IOException, JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(StudentExtended.class);

        jaxbContext.generateSchema(new SchemaOutputResolver() {
            @Override
            public Result createOutput(String namespaceUri,
                                       String suggestedFileName) throws IOException {
                File file = new File("jsontree\\src\\main\\resources\\scheme.xml");
                FileOutputStream fos = new FileOutputStream(file);
                StreamResult result = new StreamResult(fos);
                result.setSystemId(suggestedFileName);
                return result;
            }
        });
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

            marshaller.marshal(studentExtended, fos);
            fos.close();
        } catch (JAXBException e) {
            throw new RuntimeException("Can't parse xml file", e);
        }

    }
}
