public class Nature {

    public static void main(String[] args) {

        Penguin pingou = new Penguin("Pingou");
        /*pingou.dive();
        pingou.swimDown(3);
        pingou.swimUp(1);
        pingou.swimDown(4);
        pingou.swimUp(5);
        pingou.swimUp(1);
        pingou.getOut();*/

        Eagle hawkeye = new Eagle("hawkeye");
        
        hawkeye.takOff();
        hawkeye.ascend(120);
        hawkeye.ascend(30);
        hawkeye.glid();
        hawkeye.decend(140);
        hawkeye.land();
        hawkeye.decend(9);
        hawkeye.land();
        
    }
}
