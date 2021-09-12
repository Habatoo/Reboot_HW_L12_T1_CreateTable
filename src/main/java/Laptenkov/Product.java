package Laptenkov;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Класс объекта {@link Product}.
 * Обязательные поля объекта {@link Product}.
 * id: UUID
 * name: String
 * description: String
 * category: ENUM // one of COSMETICS, FOOD, CHEMICAL, TECHNIC
 * manufactureDateTime: LocalDateTime
 * manufacturer: String
 * hasExpiryTime: boolean
 * stock: int
 *
 * Реализовать метод toString
 * Написать liquibase скрипт, который создает таблицу product.
 * Таблица product может хранить все поля класса Product
 *
 * Критерии приемки
 * Предоставить PR, в котором присутствует:
 * класс Product
 * liquibase скрипт с названием create_table_product.xml,
 * который содержит инструкцию по созданию таблицы product
 */
public class Product {
    UUID id;
    String name;
    String description;
    category category;
    LocalDateTime manufactureDateTime;
    String manufacturer;
    boolean hasExpiryTime;
    int stock;

    /**
     * Конструктор без параметров объекта {@link Product}.
     */
    public Product() {
    }

    /**
     * Конструктор с полным перечнем параметров объекта {@link Product}.
     */
    public Product(UUID id,
                   String name,
                   String description,
                   category category,
                   LocalDateTime manufactureDateTime,
                   String manufacturer,
                   boolean hasExpiryTime,
                   int stock) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.manufactureDateTime = manufactureDateTime;
        this.manufacturer = manufacturer;
        this.hasExpiryTime = hasExpiryTime;
        this.stock = stock;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Laptenkov.category getCategory() {
        return category;
    }

    public void setCategory(Laptenkov.category category) {
        this.category = category;
    }

    public LocalDateTime getManufactureDateTime() {
        return manufactureDateTime;
    }

    public void setManufactureDateTime(LocalDateTime manufactureDateTime) {
        this.manufactureDateTime = manufactureDateTime;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isHasExpiryTime() {
        return hasExpiryTime;
    }

    public void setHasExpiryTime(boolean hasExpiryTime) {
        this.hasExpiryTime = hasExpiryTime;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Метод {@link Product#toString} для отображения объекта {@link Product}
     * в виде строки {@link String}  со всеми параметрами.
     * @return объект типа {@link String}.
     */
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category=" + category +
                ", manufactureDateTime=" + manufactureDateTime +
                ", manufacturer='" + manufacturer + '\'' +
                ", hasExpiryTime=" + hasExpiryTime +
                ", stock=" + stock +
                '}';
    }
}
