
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class SettingsTest {

    @Test
    void getSettingsTest() throws IOException {
        int portFromTxt = 0;
        int portFromSettingsClass = Settings.getSettings();
        try(BufferedReader reader = new BufferedReader(new FileReader(Settings.SETTINGS_PATH))){
            portFromTxt = Integer.parseInt(reader.readLine());
        } catch (IOException e){
            e.printStackTrace();
        }
        Assertions.assertTrue(portFromTxt == portFromSettingsClass);
    }
}