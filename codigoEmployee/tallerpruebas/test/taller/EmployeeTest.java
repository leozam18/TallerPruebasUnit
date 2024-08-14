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

    @Test
    @DisplayName("Test Bono Anual para Supervisor")
    void testCalculateYearBonusSupervisor() {
        float expectedBonus = 1000 + (386.0F * 0.5F);
        assertEquals(expectedBonus, supervisor.CalculateYearBonus());
        assertFalse(supervisor.CalculateYearBonus() < 0);
        assertTrue(supervisor.CalculateYearBonus() > 1000);
    }

    @Test
    @DisplayName("Test Calculo Salario con excepción")
    void testSalaryCalculationThrowsException() {
        Employee employeeWithNegativeSalary = new Employee(-1000, "USD", 0, EmployeeType.Worker);
        assertThrows(IllegalArgumentException.class, employeeWithNegativeSalary::cs);
    }

    @Test
    @DisplayName("Test Manager con Moneda no USD")
    void testCsManagerNonUsd() {
        Employee employee = new Employee(1000, "EUR", 20, EmployeeType.Manager);
        float expectedSalary = (float) (1000 * 0.95) + (20 * 0.7F);
        assertEquals(expectedSalary, employee.cs());
    }

    @AfterEach
    void tearDown() {
        System.out.println("Ejecutando @AfterEach - Limpiando después de cada prueba");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Ejecutando @AfterAll - Esto se ejecuta después de todas las pruebas");
    }



}