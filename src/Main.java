import java.util.*;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            imprimirMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarList();
                    break;
                case 2:
                    mostrarQueue();
                    break;
                case 3:
                    mostrarSet();
                    break;
                case 4:
                    mostrarMap();
                    break;
                case 5:
                    imprimir("Saliendo del programa");
                    break;
                default:
                    imprimir("Opción incorrecta");
            }
            System.out.println();
        } while (opcion != 5);

        scanner.close();
    }

    public static void imprimirMenu() {
        imprimir("Menú colecciones");
        imprimir("1. List");
        imprimir("2. Queue");
        imprimir("3. Set");
        imprimir("4. Map");
        imprimir("5. Salir");
        imprimir("Elige una opción: ");
    }

    public static void mostrarList() {
        int opcion;
        do {
            imprimir("Seleccione el tipo de list: ");
            imprimir("1. ArrayList");
            imprimir("2. LinkedList");
            imprimir("3. Vector");
            imprimir("4. Volver al menú principal");
            imprimir("Elige una opción: ");

            Scanner scanner = new Scanner(System.in);
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarArrayList();
                    break;
                case 2:
                    mostrarLinkedList();
                    break;
                case 3:
                    mostrarVector();
                    break;
                case 4:
                    imprimir("Volviendo al menú principal");
                    break;
                default:
                    imprimir("Opción incorrecta");
            }
            System.out.println();
        } while (opcion != 4);
    }

    public static void mostrarQueue(){
        int opcion;
        do {
            imprimir("Selecciona el tipo de Queue: ");
            imprimir("1. PriorityQueue");
            imprimir("2. ArrayDeque");
            imprimir("3. Volver al menú principal");
            imprimir("Elige una opción: ");

            Scanner scanner = new Scanner(System.in);
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    mostrarPriorityQueue();
                    break;

                case 2:
                    mostrarArrayDeque();
                    break;

                case 3:
                    imprimir("Volviendo al menú principal");
                    break;

                default:
                    imprimir("Opción incorrecta");
            }
            System.out.println();
        }while (opcion !=3);
    }

    public static void mostrarSet(){
        int opcion;
        do {
            imprimir("Selecciona el tipo de Set: ");
            imprimir("1. HashSet");
            imprimir("2. LinkedHashSet");
            imprimir("3. TreeSet");
            imprimir("4. Volver al menú principal");
            imprimir("Elige una opción: ");

            Scanner scanner = new Scanner(System.in);
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    mostrarHashSet();
                    break;

                case 2:
                    mostrarLinkedHashSet();
                    break;

                case 3:
                    mostrarTreeSet();
                    break;

                case 4:
                    imprimir("Volviendo al menú principal");
                    break;

                default:
                    imprimir("Opción incorrecta");
            }
            System.out.println();
        }while (opcion !=4);
    }

    public static void mostrarMap(){
        int opcion;
        do {
            imprimir("Selecciona el tipo de Map: ");
            imprimir("1. HashTable");
            imprimir("2. HashMap");
            imprimir("3. LinkedHashMap");
            imprimir("4. TreeMap");
            imprimir("5. Volver al menú principal");
            imprimir("Selecciona una opción: ");

            Scanner scanner = new Scanner(System.in);
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    mostrarHashtable();
                    break;

                case 2:
                    mostrarHashMap();
                    break;

                case 3:
                    mostrarLinkedHashMap();
                    break;

                case 4:
                    mostrarTreeMap();
                    break;

                case 5:
                    imprimir("Volviendo al menú principal");
                    break;

                default:
                    imprimir("Opción incorrecta");
            }
            System.out.println();
        }while (opcion != 5);
    }
    public static void mostrarArrayList() {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(2);
        System.out.println(arrayList);
    }

    public static void mostrarLinkedList() {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(4);
        System.out.println(linkedList);
    }

    public static void mostrarVector() {
        List<Integer> vector = new Vector<>();
        vector.add(2);
        vector.add(4);
        vector.add(1);
        vector.add(3);
        vector.add(5);
        System.out.println(vector);
    }

    public static void mostrarPriorityQueue() {
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(3);
        priorityQueue.add(2);
        System.out.println(priorityQueue);
    }

    public static void mostrarArrayDeque() {
        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(4);
        arrayDeque.add(3);
        arrayDeque.add(1);
        arrayDeque.add(5);
        arrayDeque.add(2);
        System.out.println(arrayDeque);
    }
    public static void mostrarHashSet() {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(1);
        hashSet.add(4);
        System.out.println(hashSet);
    }

    public static void mostrarLinkedHashSet(){
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(4);
        linkedHashSet.add(5);
        linkedHashSet.add(3);
        linkedHashSet.add(2);
        linkedHashSet.add(1);
        System.out.println(linkedHashSet);
    }

    public static void mostrarTreeSet(){
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(4);
        treeSet.add(2);
        System.out.println(treeSet);
    }

    public static void mostrarHashtable() {
        Map<String, String> hashTable = new Hashtable<>();
        hashTable.put("Hola", "de nuevo");
        hashTable.put("Hola", "de nuevo 2");
        hashTable.put("Hola", "de nuevo 3");
        hashTable.put("Hola", "de nuevo 4");
        hashTable.put("Hola", "de nuevo 5");
        System.out.println(hashTable);
    }

    public static void mostrarHashMap(){
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Bryan: ", 30);
        hashMap.put("Ivonne: ", 29);
        hashMap.put("Karol: ", 23);
        hashMap.put("Francisco: ", 30);
        hashMap.put("Geral: ", 31);
        System.out.println(hashMap);
    }

    public static void mostrarLinkedHashMap(){
        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(9,18);
        linkedHashMap.put(27,36);
        linkedHashMap.put(45,54);
        linkedHashMap.put(63,72);
        linkedHashMap.put(81,90);
        System.out.println(linkedHashMap);
    }

    public static void mostrarTreeMap(){
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(5, "Primer número");
        treeMap.put(10, "Segundo número");
        treeMap.put(15, "Tercer número");
        treeMap.put(20, "Cuarto número");
        treeMap.put(25, "Quinto número");
        System.out.println(treeMap);
    }

    public static void imprimir(String mensaje) {
        System.out.println(mensaje);
    }
}
