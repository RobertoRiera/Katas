package Kata5;

public class Kata5 {

    public static void main(String[] args) {
        PersonLoader loader = new MockPersonLoader();
        HistogramBuilder<Person> builder = new HistogramBuilder<Person>(loader.load());
        GraphicalHistogramViewer<String> viewer = new GraphicalHistogramViewer<String>(builder.build(createAttributeExtractor()));
        viewer.show();
    }

    public static AttributeExtractor<Person, String> createAttributeExtractor(){
        return new AttributeExtractor<Person, String>() {

            @Override
            public String extract(Person person) {
                return person.getMail().getDomain();
            }
        };
    }
}