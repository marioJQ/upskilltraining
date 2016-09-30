package properties;

/**
 * Created by nxtlvl on 9/29/2016.
 */
    public class Animals {

        private String animalName;
        private Boolean animalExistence;
        private Float animalSize;


            public String getAnimalName() {
                return animalName;
            }

                public void setAnimalName(String animalName) {
                this.animalName = animalName;
            }

            public Boolean getAnimalExistence() {
                return animalExistence;
            }

                public void setAnimalExistence(Boolean animalExistence) {
                this.animalExistence = animalExistence;
            }

            public Float getAnimalSize() {
                return animalSize;
            }

                public void setAnimalSize(Float animalSize) {
                this.animalSize = animalSize;
            }


     public String introduceAnimal () {
         return
                 "Animal Name:" + animalName + "\n" +
                 "Is Animal Existing ? :" + animalExistence +"\n" +
                 "Animal Size :" + animalSize+"Inches" ;
        }
}
