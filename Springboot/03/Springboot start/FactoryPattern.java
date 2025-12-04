public class FactoryPattern {
    public static void main(String[] args) {
        makeVehicle();
        makeVehicle2();
    }
    public static void makeVehicle(){
        SonySpeakers sonySpeakers = new SonySpeakers();
        System.out.println(sonySpeakers.makeSound());
        MichelinTyres michelinTyres = new MichelinTyres();
        System.out.println(michelinTyres.rotate());
    }

    public static void makeVehicle2(){
        SpeakerFactory speakerFactory = new SpeakerFactory();
        Speakers speakers = speakerFactory.getSpeaker("bose");
        System.out.println(speakers.makeSound());

        TyreFactory tyreFactory = new TyreFactory();
        Tyres tyres = tyreFactory.getTyre("bridgstone");
        System.out.println(tyres.rotate());
    }

}


   // Speakers
interface Speakers{
    String makeSound();
}
class BoseSpeakers implements Speakers{
    public String makeSound(){
        return "Bose Music";
    }
}
class SonySpeakers implements Speakers{
    public String makeSound(){
        return "Sony music";
    }
}
 class SpeakerFactory{
    Speakers getSpeaker(String speakerType){
        if(speakerType == null){
            return null;
        }
        if(speakerType.equalsIgnoreCase("SONY")){
            return new SonySpeakers();
        }
        if(speakerType.equalsIgnoreCase("BOSE")){
            return new BoseSpeakers();
        }
            return null;
    }
 }


 // Tyres

interface Tyres{
    String rotate();
}
class MichelinTyres implements Tyres{
    public String rotate(){
        return "Michelin Tyres Rotating" ;
    }
}
class BridgeStoneTyres implements Tyres{
    public String rotate(){
        return "BridgeStone tyre Rotating"  ;
    }
}
class TyreFactory{
    Tyres getTyre(String tyreType){
        if(tyreType == null){
            return null;
        }
        if(tyreType.equalsIgnoreCase("michelin")){
            return new MichelinTyres();
        }
        if(tyreType.equalsIgnoreCase("bridgstone")){
            return new BridgeStoneTyres();
        }
        return null;
    }
}

