package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {

        Animal[] animalArr={new Dog(), new Cat(), new Caw()};

        for(Animal animal:animalArr){
            //단축키 Ctrl+alt+M
            soundAnimal(animal);
        }
    }

    //변하지 않는 부분(변하는 부분을 최소화 하는게 좋음)
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
