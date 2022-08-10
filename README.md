Spring_Spingboot

Puntos a tener en cuenta:

Los perfiles para Login son:

PROFESIONAL
Usuario: profesional
Contraseña: profesional

CLIENTE
Usuario: cliente
Contraseña: cliente

ADMINISTRATIVO
Usuario: administrativo
Contraseña: administrativo

Modificar la información de acceso a la base de datos en "application-dev.properties", la cual se encuentra en
/static/db


Integrantes: Amanda Díaz -> https://github.com/Amyyinthesky/SprintJava2.git

Nicolay López -> https://github.com/Liocan123/Sprint_Spring

Mauricio Seguel -> https://github.com/IronWesso/Sprint_Spring_OnWinter

Constanza Vivar -> https://github.com/Constanzavm/Spring_Spingboot

El programa de SprintJava es una solución tecnológica que cubre los procesos de mejora de gestión, control, 
seguridad y disponibilidad de información para una empresa de asesorías en Prevención de Riesgos Laborales.
Gracias a este código, se pueden administrar los procesos que se deben ejecutar en cada una de las empresas
que son clientes de la compañía. Dentro del código existen 13 funciones:

Contacto

Crear capacitación

Listar capacitación

Entrar al login con 3 tipos de usuarios

Listado de usuarios

Crear usuarios

Editar cliente

Editar profesional

Editar administrativo

Listar visitas

Responder checklist

Listado de pagos

Crear pagos

En cada una de estas opciones, se genera una base de datos en SQL que permite administrar
la información con las actividades que se realizan y con el trabajo de recurso humano de
la compañía. De esta manera un cliente puede quedar ingresado o ser editado, puede tomar
ninguna o varias capacitaciones, administrar los accidentes, las visitas en terreno, las 
cuales pueden tener una o más revisiones. Además, los comandos para realizar estas 
actividades son fáciles de encontrar, con datos específicos con un Código de identificación
especificado como el RUN, Id de Capacitación o de Visitas a Terreno, y tiene la posibilidad
de realizarse aun no teniendo conectividad. Por otro lado, su responsividad funciona de tal
manera, que los datos obligatorios no pueden quedar en blanco, analiza y muestra los errores
al momento de ingresar mal un dato, y permite escribir la información correcta.

La página está diseñada para que distintos usuarios ingresen con un nombre de usuario y clave,
y estos se dividirán en 3 tipos de usuarios: Cliente, Administrativo y Profesional, donde cada
uno tiene acceso a distintas pestañas dentro de la página web, las cuales son responsivas y
pueden estar ligada de acuerdo con el tipo de usuario que ingresa. También es importante recalcar
que la seguridad de los datos está garantizada gracias al Spring Security para el manejo de
sesiones, y gracias a esto, la información ingresada desde el ingreso del usuario en adelante
queda encriptada.

Gracias a que se pueden listar los distintos datos ingresados, el programa nos permite generar
reportes y estadísticas que ayudan a la toma de decisiones y mejorar el rendimiento de la empresa
en el menor tiempo posible, y ayudando a gestionar las respuestas a las demandas de los clientes,
y las actividades que involucra para el cumplimiento de los contratos.