    package Model;

    public class Product {

        private String name;
        private String category;
        private String prise;

        public Product(String name, String category, String prise) {
            this.name = name;
            this.category = category;
            this.prise = prise;
        }

        public String getName() {
            return name;
        }

        public String getCategory() {
            return category;
        }

        public String getPrise() {
            return prise;
        }

    }
