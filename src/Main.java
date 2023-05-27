public class Main {
    public static void main(String[] args) {
        String name = "firstName_lastName";
        String spaceName = name.replace('_',' ');
        String capitalLetter = spaceName.substring(0,1).toUpperCase();
        String capitalisedSpaceName = capitalLetter + spaceName.substring(1);
        System.out.println("Name : " + capitalisedSpaceName);
    }
}