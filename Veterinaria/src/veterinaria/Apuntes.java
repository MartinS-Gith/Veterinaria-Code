package veterinaria;

/*
Enunciado del ejercicio

Desarrollar una mini-aplicación en Java para gestionar una colección de animales
en una clínica veterinaria.

Requisitos:

Todos los animales (clase padre) tienen los atributos comunes:
codigo (String)
nombre (String)
peso (double) (en kg)
fechaIngreso (LocalDate) (la fecha en que ingresó a la clínica)

Se tienen dos tipos de animales (clases hijas):
AnimalDomestico: incluye además:
raza (String)
especie (String) (por ejemplo “perro”, “gato”)
estaVacunado (boolean)

AnimalSalvaje: incluye además:
habitat (String) (por ejemplo: “selva”, “sabana”, “montaña”)
especie (String) (por ejemplo “león”, “tigre”)
nivelPeligrosidad (int) (valor de 1 a 5, donde 5 es máximo)

Lógica de negocio adicional:
-Si el animal es doméstico y no está vacunado, se debe mostrar un mensaje de 
“vacunación pendiente”.
-Si el animal es salvaje y su nivelPeligrosidad es mayor o igual a 4, se le 
asignaun “tratamiento especial” (método que modifica algún atributo o imprime
un aviso).
-Calcular el tiempo que lleva el animal en la clínica (en días) desde
su fechaIngreso.

Funcionalidades que debe permitir la aplicación:
1.- Ingresar animales (domésticos o salvajes) a la colección, validando que no haya 
duplicados por codigo.
2.- Mostrar los datos completos de un animal dado su codigo.
3.- Mostrar cuántos animales domésticos y cuántos salvajes hay en el sistema.
4.- Aplicar el chequeo general para todos los animales: para domésticos, revisar 
vacunas; para salvajes, revisar nivel de peligrosidad.
5.- Salir del sistema.

*/
