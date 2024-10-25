import oop.Person;

/*
 Exerciții OOP Java: Clase și Interacțiuni între Clase

 1. Sistem de Bibliotecă
    Clase implicate: Carte, Autor, Biblioteca
    - Carte: are titlu, autor (obiect de tip Autor), gen, și numărul de pagini.
    - Autor: are nume, naționalitate și anul nașterii.
    - Biblioteca: are o listă de obiecte Carte și metode pentru a adăuga cărți, a căuta cărți după autor și a obține toate cărțile de un anumit gen.
    Extensii:
    - Adaugă metode pentru a căuta cărți cu un număr specific de pagini, a afișa toți autorii disponibili și a găsi cărțile unui autor anume.

 2. Sistem de Management al Studenților
    Clase implicate: Student, Curs, Profesor
    - Student: are nume, vârstă, o listă de cursuri (obiecte Curs), și o metodă pentru a calcula media notelor la toate cursurile.
    - Curs: are denumire, profesor (obiect de tip Profesor), și o listă de note.
    - Profesor: are nume, departament și o listă de cursuri pe care le predă.
    Extensii:
    - Creează metode pentru a adăuga sau elimina cursuri pentru un student și a afișa media generală a unui curs.

 3. Parc Auto
    Clase implicate: Masina, Sofer, ParcAuto
    - Masina: are marca, model, anul fabricației, și kilometraj.
    - Sofer: are nume, permis de conducere, și o listă de mașini pe care le-a condus (obiecte Masina).
    - ParcAuto: are o listă de mașini disponibile și metode pentru a atribui o mașină unui șofer sau pentru a calcula numărul total de kilometri efectuați de toate mașinile din parc.
    Extensii:
    - Adaugă o metodă pentru a înregistra kilometrajul fiecărei mașini și a găsi șoferii care au condus cel mai mult o anumită mașină.

 4. Sistem de Comenzi pentru Magazin Online
    Clase implicate: Produs, Comanda, Client, Magazin
    - Produs: are nume, preț și stoc.
    - Client: are nume, adresa și o listă de comenzi.
    - Comanda: conține o listă de produse comandate și metode pentru a
    calcula valoarea totală a comenzii.
    - Magazin: gestionează stocul și comenzi, permițând clienților să
    plaseze comenzi noi.
    Extensii:
    - Adaugă metode în Magazin pentru a verifica stocul înainte de plasarea
    unei comenzi și pentru a aplica reduceri speciale anumitor clienți.
*/
public class Main {


  public static void main(String[] args) {
    System.out.println("Hello world!");

    Person person = new Person("Joe");

    System.out.println(person.getName());
  }
}