public class Key {

    private String type;
    private String namespace;
    private String name;


    public static class KeyBuilder {
        public static KeyBuilder newKey(){
            return new KeyBuilder();
        }

        private Key key;

        private KeyBuilder(){
            key = new Key();
        }

        public KeyBuilder setType(String type){
            key.type = type;
            return this;
        }

        public KeyBuilder setNamespace(String namespace){
            key.namespace = namespace;
            return this;
        }

        public KeyBuilder setName(String name){
            key.name = name;
            return this;
        }

        public Key get(){
            return key;
        }

    }



}