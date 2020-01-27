package org.example.travel_agency.destination;

public class Cost {
        PersonNumb personNumb;
        private double adultPrice;
        private double childPrice= 0.3*adultPrice;
        private double teensPrice=0.7*adultPrice;

/*public double priceCounting(){

    double price = (numbOfAdults->) personNumb.getAdultPersonNumber() * adultPrice + (numbOfChild->) personNumb.getChildPersonNumber()*childPrice + (numbOfTeens->) personNumb.getTeensPersonNumber() *teensPrice;

    return "Cena całkowita wynosi "+ price +"zł";

}}*/

        public Cost(PersonNumb personNumb, double adultPrice, double childPrice, double teensPrice) {
                this.personNumb = personNumb;
                this.adultPrice = adultPrice;
                this.childPrice = childPrice;
                this.teensPrice = teensPrice;
        }

        public PersonNumb getPersonNumb() {
                return personNumb;
        }

        public void setPersonNumb(PersonNumb personNumb) {
                this.personNumb = personNumb;
        }

        public double getAdultPrice() {
                return adultPrice;
        }

        public void setAdultPrice(double adultPrice) {
                this.adultPrice = adultPrice;
        }

        public double getChildPrice() {
                return childPrice;
        }

        public void setChildPrice(double childPrice) {
                this.childPrice = childPrice;
        }

        public double getTeensPrice() {
                return teensPrice;
        }

        public void setTeensPrice(double teensPrice) {
                this.teensPrice = teensPrice;
        }

        @Override
        public String toString() {
                return "Cost{" +
                        "personNumb=" + personNumb +
                        ", adultPrice=" + adultPrice +
                        ", childPrice=" + childPrice +
                        ", teensPrice=" + teensPrice +
                        '}';
        }
}
