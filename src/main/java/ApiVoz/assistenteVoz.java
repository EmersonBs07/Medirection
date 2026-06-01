package ApiVoz;


public class assistenteVoz {

    public static void falar(String texto) {

        try {

            String comando =
                    "PowerShell -Command " +
                    "\"Add-Type -AssemblyName System.Speech;" +
                    "$voz = New-Object System.Speech.Synthesis.SpeechSynthesizer;" +
                    "$voz.Speak('" + texto + "');\"";

            Runtime.getRuntime().exec(comando);

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}