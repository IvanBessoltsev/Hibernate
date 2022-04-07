package Homework23;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class HibernateTest {

    public static void main(String[] args) {

//------------------Создаем сессию
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Books.class)
                .addAnnotatedClass(Authors.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();

//------------------Создаем объекты
            Authors author = new Authors("Толстой Лев Николаевич");
            Authors author2 = new Authors("Александр Сергеевич Пушкин");
            Books book = new Books("Война и Мир", 1777, 200, 200);
            Books book2 = new Books("Евгений Онегин", 1888, 300, 222);
            book.setAuthorID(author);
            book2.setAuthorID(author2);

//-----------Запускаем транзакцию
            session.beginTransaction();
            session.save(book);
            session.save(book2);

//-----------Выводим объеты из таблицы
            List<Books> books = session.createQuery("from Books").getResultList();
            for (Books b : books)
                System.out.println(b);

//-----------Закрываем транзакцию
            session.getTransaction().commit();
            System.out.println("Done!!!");
        } finally {
            factory.close();
        }


    }


}









