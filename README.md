# 🏦 Proyecto Banco XYZ - Microservicios y BFFs

Este repositorio forma parte de una arquitectura distribuida compuesta por microservicios y BFFs que interactúan con una base de datos MySQL en contenedor Docker. Los BFFs están protegidos con HTTPS y Spring Security.

---

## 🔹 Microservicios

### 📁 ms-cuentas-anuales-bancoxyz

**Descripción:**  
Gestión de cuentas anuales bancarias.
### ✅ `ms-cuentas-anuales-bancoxyz`
---

### ✅ `bancoxyzSemana4BFF`

```markdown
# 📁 bancoxyzSemana4BFF

**Descripción:**  
Microservicio de soporte compartido para lógica común entre servicios (auditoría, validación, etc.).

**Tecnologías:**  
- Java 17 + Spring Boot  
- MySQL (contenedor Docker)  
- Maven

**Configuración rápida:**
```bash
git clone https://github.com/LeoOlivaresD/bancoxyzSemana4BFF.git
mvn spring-boot:run
