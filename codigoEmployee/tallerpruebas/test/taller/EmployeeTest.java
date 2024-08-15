package taller;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {


 	private Employee worker;
    private Employee supervisor;
    private Employee manager;

    @BeforeAll
    static void setUpAll() {
        System.out.println("Ejecutando @BeforeAll - Esto se ejecuta antes de todas las pruebas");
    }

    @BeforeEach
    void setUp() {
        worker = new Employee(1000, "USD", 0, EmployeeType.Worker);
        supervisor = new Employee(1000, "USD", 10, EmployeeType.Supervisor);
        manager = new Employee(1000, "USD", 20, EmployeeType.Manager);
        System.out.println("Ejecutando @BeforeEach - Configuración para cada prueba");
    }

    @Test
    @DisplayName("Test Salario con Worker en mes par")
    void testCsWorkerEvenMonth() {
        // Simulamos que estamos en un mes par.
        assertEquals(1000, worker.cs());
        assertNotNull(worker);
        assertSame(worker, worker);
        assertNotSame(worker, supervisor);
    }
    
    /*Se verifica que el salario calculado para un empleado de tipo 
    Worker en un mes par sea correcto, es decir, sin incluir el décimo tercer sueldo. 
    También se asegura de que el objeto worker no sea nulo, y que sea el mismo cuando se compara consigo mismo.*/
    
    
    

    @Test
    @DisplayName("Test Bono Anual para Supervisor")
    void testCalculateYearBonusSupervisor() {
        float expectedBonus = 1000 + (386.0F * 0.5F);
        assertEquals(expectedBonus, supervisor.CalculateYearBonus());
        assertFalse(supervisor.CalculateYearBonus() < 0);
        assertTrue(supervisor.CalculateYearBonus() > 1000);
    }
    /*sta prueba asegura que el cálculo del bono anual para un Supervisor sea correcto, 
    sumando el bono esperado al salario básico. Además, verifica que el bono calculado sea mayor 
    que cero y que supere un umbral específico.*/
    
    
    
    

    @Test
    @DisplayName("Test Calculo Salario con excepción")
    void testSalaryCalculationThrowsException() {
        Employee employeeWithNegativeSalary = new Employee(-1000, "USD", 0, EmployeeType.Worker);
        assertThrows(IllegalArgumentException.class, employeeWithNegativeSalary::cs);
    }
    //Se verifica que el método cs() lanza una excepción 
    //IllegalArgumentException cuando el salario del empleado es negativo, lo cual no es permitido.
    
    
    
    
    

    @Test
    @DisplayName("Test Manager con Moneda no USD")
    void testCsManagerNonUsd() {
        Employee employee = new Employee(1000, "EUR", 20, EmployeeType.Manager);
        float expectedSalary = (float) (1000 * 0.95) + (20 * 0.7F);
        assertEquals(expectedSalary, employee.cs());
    }
    /*Esta prueba asegura que cuando la moneda del salario no es USD 
    (por ejemplo, EUR), el salario se calcula correctamente, aplicando el 
    descuento del 5% antes de sumar el bono correspondiente.*/
    
    
    
    
    

    @AfterEach
    void tearDown() {
        System.out.println("Ejecutando @AfterEach - Limpiando después de cada prueba");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Ejecutando @AfterAll - Esto se ejecuta después de todas las pruebas");
    }

    
    
    //Los métodos setUp() y tearDown() son usados para configurar los objetos necesarios antes de cada prueba y 
    //limpiar cualquier estado después de cada prueba. Esto asegura que cada prueba se ejecute en un entorno limpio y aislado.
    
    //Los métodos setUpAll() y tearDownAll() se utilizan para realizar configuraciones o limpiezas que solo necesitan 
    //ejecutarse una vez para todo el conjunto de pruebas, como la inicialización de recursos compartidos.
    
    
    
    


}