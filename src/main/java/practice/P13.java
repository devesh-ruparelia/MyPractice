package practice;

public class P13 {

    public static void main(String[] args) {
        Physician physician = new Physician();
        physician.setCount(3);
        Integer noOfSpeakerCount=3;
        System.out.println(noOfSpeakerCount.equals(physician.getCount()));
    }

}
