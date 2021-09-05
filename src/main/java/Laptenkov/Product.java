package Laptenkov;

/**
 * Создать класс Product со следующими полями
 * id: UUID name: String description: String category: ENUM // one of COSMETICS, FOOD, CHEMICAL,
 * TECHNIC manufactureDateTime: LocalDateTime manufacturer: String hasExpiryTime: boolean stock: int
 *
 * Реализовать метод toString
 * Написать liquibase скрипт, который создает таблицу product. Таблица product может хранить все поля класса Product
 *
 * Критерии приемки
 * Предоставить PR, в котором присутствует:
 * класс Product
 * liquibase скрипт с названием create_table_product.xml, который содержит инструкцию по созданию таблицы product
 */
public class Product {
}
