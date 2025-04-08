import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        Horno<Pizza> horno = new Horno<>(5);
        int numElementos;
        Pizza pizza;

        do {
            System.out.println("""
                    MENÚ DE OPCIONES
                    1. Insertar pizza
                    2. Mostrar pizzas
                    3. Encender horno
                    4. Salir
                    """);
            System.out.print("Introduce una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    insertarPizza();
                    break;
                case 2:
                    numElementos = horno.getNumElementos();
                    int pizzasConBorde = 0;
                    for (int i = 0; i < numElementos; i++) {
                        pizza = (Pizza) horno.pop();
                        if (pizza instanceof PizzaClasica clasica) {
                            if (clasica.isBordeConQueso()) {
                                pizzasConBorde++;
                            }
                        }
                        horno.push(pizza);
                    }
                    if (pizzasConBorde > 0) {
                        System.out.println("El porcentaje de pizzas con borde de queso será: " + (pizzasConBorde * 100) / numElementos + "%");
                    }else{
                        System.out.println("No hay pizzas con borde de queso");
                    }
            }
        } while (opcion != 4);
    }

    public static void insertarPizza() {
        int pizzaElegida;
        int tiempoCoccion, opcionBorde;
        double precio;

        System.out.print("Introduce el tiempo de cocción: ");
        tiempoCoccion = sc.nextInt();

        System.out.print("Introduce el precio: ");
        precio = sc.nextDouble();

        do {
            System.out.print("Introduce Calzone / Clásica [1/2]: ");
            pizzaElegida = sc.nextInt();
        } while (pizzaElegida < 1 || pizzaElegida > 2);
        if (pizzaElegida == 1) {
            PizzaCalzone calzone = new PizzaCalzone(tiempoCoccion, precio);
        } else {
            do {
                System.out.print("Bordes con queso Sí / No: [1/2]: ");
                opcionBorde = sc.nextInt();
            } while (opcionBorde < 1 || opcionBorde > 2);
            if (opcionBorde == 1) {
                PizzaClasica clasica = new PizzaClasica(tiempoCoccion, precio, true);
            } else {
                PizzaClasica clasica = new PizzaClasica(tiempoCoccion, precio, false);
            }
        }
    }
}