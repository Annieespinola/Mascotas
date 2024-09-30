# Violación
El uso de inyección de dependencias a nivel de campo (field injection) en lugar de usar inyección a través de constructor o métodos setter.
# Correccion/Refactorizacion
Código Corregido

    public class MascotaService {
    private final MascotaRepositorio mascotaRepositorio;

    @Autowired
    public MascotaService(MascotaRepositorio mascotaRepositorio){
        this.mascotaRepositorio = mascotaRepositorio;
    }
    }
# Fragmento de código

    public class MascotaService {
    @Autowired
    private MascotaRepositorio mascotaRepositorio;
    }
# Violación
Una exposición de secretos (como contraseñas, claves de API, tokens de autenticación, etc.) en el código fuente o en entornos no controlados, como repositorios de código público o entornos de despliegue que no estén adecuadamente asegurados. Este tipo de vulnerabilidad implica la violación de fronteras de confianza.
# Correccion/Refactorizacion
Código Corregido

    spring.datasource.password=${DB_PASSWORD}

# Fragmento de código

    spring.datasource.password=123456789

# Violación
El documento HTML no está especificando el atributo lang o xml:lang en el elemento <html>. Esto afecta la accesibilidad del documento, ya que los lectores de pantalla y otras tecnologías de asistencia no pueden adaptar correctamente la pronunciación y acento del texto, lo que resulta en una experiencia de usuario pobre para personas con discapacidades visuales o auditivas.
# Correccion/Refactorizacion
Código Corregido

    spring.datasource.password=${DB_PASSWORD}

# Fragmento de código

    <!DOCTYPE html>
    <html xmlns:th="http://www.thymeleaf.org">
    <head>
    <title>Lista de Mascotas</title>
    </head>
    <body>
    <h1>Lista de Mascotas</h1>
    <ul>
        <li th:each="mascota : ${mascotas}">
            <span th:text="${mascota.nombre}">Nombre</span>
            - <span th:text="${mascota.especie}">Especie</span>
        </li>
    </ul>
    </body>
    </html>