package TAREAH2;
public class Main {
    public static void main(String[] args) {

        // Crear el país Bolivia
        Provincia prov1 = new Provincia();
        prov1.setNombre(" provincia Prado");
        Provincia prov2 = new Provincia();
        prov2.setNombre("provincia Pacajes");

        Provincia[] provlapaz = new Provincia[2];
        provlapaz[0] = prov1;
        provlapaz[1] = prov2;

        Provincia prov3 = new Provincia();
        prov3.setNombre("Provincia caluyo");
        Provincia prov4 = new Provincia();
        prov4.setNombre("Provincia suyo");

        Provincia[] provcochabamba = new Provincia[2];
        provcochabamba[0] = prov3;
        provcochabamba[1] = prov4;

        Provincia prov5 = new Provincia();
        prov5.setNombre("Provincia caja");
        Provincia prov6 = new Provincia();
        prov6.setNombre("Provincia dado");

        Provincia[] provSanta_Cruz = new Provincia[2];
        provSanta_Cruz[0] = prov5;
        provSanta_Cruz[1] = prov6;



        Departamento dep1 = new  Departamento();
        dep1.setNombre("La Paz");
        dep1.setNroProv(2);
        dep1.setProvincias(provlapaz);

        Departamento dep2 = new  Departamento();
        dep2.setNombre("Cochabamba");
        dep2.setNroProv(2);
        dep2.setProvincias(provcochabamba);
        Departamento dep3 = new  Departamento();
        dep3.setNombre("Santa_Cruz");
        dep3.setNroProv(2);
        dep3.setProvincias(provSanta_Cruz);

        Departamento[] dep = new Departamento[3];
        dep[0] = dep1;
        dep[1] = dep2;
        dep[2] = dep3;

        Pais p = new Pais();
        p.setNombre("Bolivia");
        p.setNroDeps(3);
        p.setDepartamentos(dep);

        System.out.println("\n\n\n\n");
        p.mostrarPais();


        /*
         */

        Departamento depinsert = new  Departamento();
        Provincia prov7 = new Provincia();
        prov7.setNombre("Provincia andes");
        Provincia prov8 = new Provincia();
        prov8.setNombre("Provincia andes");

        Provincia[] provTarija = new Provincia[2];
        provTarija[0] = prov7;
        provTarija[1] = prov8;

        depinsert.setNombre("Tarija");
        depinsert.setNroProv(2);
        depinsert.setProvincias(provTarija);
        depinsert.agregarNuevaProvincia(prov6);

        System.out.println("\n\n\n\n");
        depinsert.mostrarDepartamento();

        Provincia[] provSC = new Provincia[0];

        Departamento depnew = new  Departamento();
        depnew.setNombre("Santa Cruz");
        depnew.setNroProv(0);
        depnew.setProvincias(provSC);

        p.agregarNuevoDepartamento(depnew);
        System.out.println("\n\n\n\n");
        p.mostrarPais();


    }
}