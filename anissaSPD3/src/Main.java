public class Main {
    public static void main(String[] args) {
        System.out.println("=== Конвертер единиц ===");

        AmericanSystem americanData = new AmericanSystem(68.0, 6.0, 150.0);
        System.out.println("Американские данные:");
        System.out.println("Температура: " + americanData.getFahrenheit() + "°F");
        System.out.println("Рост: " + americanData.getFeet() + " футов");
        System.out.println("Вес: " + americanData.getPounds() + " фунтов");

        System.out.println("\n--- Через адаптер ---");

        MetricSystem adapter = new Adapter(americanData);

        System.out.println("Метрические данные:");
        System.out.println("Температура: " + adapter.getCelsius() + "°C");
        System.out.println("Рост: " + adapter.getMeters() + " метров");
        System.out.println("Вес: " + adapter.getKilograms() + " кг");
    }
}