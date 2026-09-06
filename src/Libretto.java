import java.util.ArrayList;

// интерфейс для загрузки текста либретто
// либретто большой текст. Записывать и хранить его в переменной String неудобно
// поэтому предложим инструмент для загрузки из некоторого источника по предложениям
// конкретно это решение предполагает ввод программистом с возможностью дальнейшего расширения функционала по мере роста мастерства :)
class Libretto {
    private ArrayList<String> librettoText;

    Libretto() {
        librettoText = new ArrayList<>();
        loadText("Фауст в своем кабинете.");
        loadText("Входит Вагнер.");
    }

    public void loadText(String sentence) {
        librettoText.add(sentence);
    }

    public ArrayList<String> getLibrettoText() {
        return librettoText; 
    }
}
