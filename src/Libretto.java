import java.util.ArrayList;

// интерфейс для загрузки текста либретто
// либретто большой текст. Записывать и хранить его в переменной String неудобно
// поэтому предложим инструмент для загрузки из некоторого источника по предложениям в список строк
// конкретно это решение предполагает ввод программистом с возможностью дальнейшего расширения функционала по мере роста мастерства :)
public class Libretto {
    private final ArrayList<String> librettoText;

    Libretto() {
        librettoText = new ArrayList<>();
        loadText("Фауст в своем кабинете.");
        loadText("Входит Вагнер.");
        loadText(".\n.\n.");
    }

    public void loadText(String sentence) {
        librettoText.add(sentence);
    }

    public ArrayList<String> getLibrettoText() {
        return librettoText; 
    }
}
