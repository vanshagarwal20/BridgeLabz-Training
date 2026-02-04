package lambda_expressions;

@FunctionalInterface
interface LightTrigger {
    void activate();
}

public class SmartHome {
    public static void main(String[] args) {

        LightTrigger motionTrigger = () ->
                System.out.println("Lights ON with bright white mode");

        LightTrigger nightTrigger = () ->
                System.out.println("Lights ON with warm dim mode");

        LightTrigger voiceTrigger = () ->
                System.out.println("Lights ON with custom color");

        motionTrigger.activate();
        nightTrigger.activate();
        voiceTrigger.activate();
    }
}
