
public class PartyMain {
    public static void main(String[] args) {
        Cd cd1 = new Cd("Sex Pistols", "Nervermind", "Punk", 50);
        Cd cd2 = new Cd("Sex Pistols", "Bollocks", "Punk,", 40);

        CdPlayer sony = new CdPlayer("Sony");
        System.out.println(sony.toString());
        sony.turnOn();
        System.out.println(sony.toString());
        sony.increaseVolume(200);
        System.out.println(sony.toString());

        System.out.println(sony.playCd());

        sony.addCd(cd1);
        System.out.println(sony.playCd());

        sony.increaseVolume(-80);
        System.out.println(sony.toString());

        sony.increaseVolume(-25);
        System.out.println(sony.toString());

        sony.addCd(cd2);
        sony.increaseVolume(35);
        System.out.println(sony.playCd());
        System.out.println(sony.toString());

        Cd cd3 = new Cd("The Rolling Stones", "Sticky fingers", "Garage", 65);
        sony.addCd(cd3);
        sony.removeCd(cd1);
        sony.increaseVolume(20);
        System.out.println(sony.toString());

        PartyController partyController = new PartyController();
        partyController.prepareParty(180);
        System.out.println(partyController.toString());




    }
}
