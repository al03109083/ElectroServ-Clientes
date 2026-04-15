# ElectroServ-Clientes
Sistema de registro de clientes - Proyecto Integrador
---

# 🧾 Sistema de Registro de Clientes

## 📌 Descripción

Sistema desarrollado en Java que permite registrar, almacenar y visualizar clientes mediante una interfaz gráfica sencilla conectada a una base de datos MySQL.

---

## 🚨 Problema identificado

La empresa *ElectroServ Solutions S.A. de C.V.* no cuenta con un sistema digital para gestionar clientes, lo que genera:

* Pérdida de información
* Duplicidad de registros
* Dificultad para buscar clientes
* Falta de organización

---

## 💡 Solución

Se desarrolló una aplicación que permite:

* Registrar clientes
* Guardar información en base de datos
* Visualizar clientes en tabla
* Validar datos básicos

---

## 🏗️ Arquitectura

```
[Usuario]
   ↓
[Java Swing]
   ↓
[ClienteDAO]
   ↓
[Conexion]
   ↓
[MySQL]
```

---

## 📚 Tabla de Contenidos

* [Requerimientos](#-requerimientos)
* [Instalación](#-instalación)
* [Configuración](#-configuración)
* [Uso](#-uso)
* [Contribución](#-contribución)
* [Roadmap](#-roadmap)

---

## ⚙️ Requerimientos

### Software

* Java JDK 17+
* MySQL Server
* Apache NetBeans
* MySQL Workbench

### Base de datos

* MySQL
* Base de datos: `clientes_db`

### Dependencias

* MySQL Connector/J

---

## 🛠️ Instalación

### 1. Clonar repositorio

```bash
(https://github.com/al03109083/ElectroServ-Clientes.git)
```

---

### 2. Abrir en NetBeans

* File → Open Project
* Seleccionar carpeta del proyecto

---

### 3. Configurar base de datos

Ejecutar en MySQL:

```sql
CREATE DATABASE clientes_db;

USE clientes_db;

CREATE TABLE clientes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    empresa VARCHAR(100),
    telefono VARCHAR(20),
    correo VARCHAR(100)
);
```

---

### 4. Configurar conexión

Editar clase `Conexion.java`:

```java
private static final String USER = "root";
private static final String PASS = "TU_PASSWORD";
```

---

## ▶️ Ejecución

* Ejecutar proyecto en NetBeans
* Llenar formulario
* Presionar botón **Guardar**

---

## 🧪 Pruebas manuales

1. Ingresar datos en formulario
2. Guardar cliente
3. Verificar que aparece en la tabla
4. Validar en MySQL que el registro existe

---

## ☁️ Despliegue (Local / Nube)

### Local

* Ejecutar desde NetBeans

### Nube (opcional)

* Puede desplegarse en plataformas como:

  * Heroku (requiere adaptación a web)
  * Railway / Render

---

## ⚙️ Configuración

### Archivo clave

```java
Conexion.java
```

Permite configurar:

* URL de base de datos
* Usuario
* Contraseña

---

## 👤 Uso

### Usuario final

* Ingresar datos del cliente
* Presionar guardar
* Visualizar lista de clientes

---

### Administrador

* Configurar conexión
* Administrar base de datos
* Validar registros

---

## 🤝 Contribución

### Pasos para contribuir

```bash
# 1. Clonar repositorio
https://github.com/al03109083/ElectroServ-Clientes.git

# 2. Crear branch
git checkout -b feature/nueva-funcionalidad

# 3. Hacer cambios
git add .
git commit -m "Nueva funcionalidad"

# 4. Subir cambios
git push origin feature/nueva-funcionalidad
```

---

### Pull Request

1. Ir a GitHub
2. Crear Pull Request
3. Revisar cambios
4. Hacer merge

---

## 🛣️ Roadmap

Futuras mejoras:

* 🔍 Búsqueda de clientes
* ✏️ Edición de registros
* 🗑️ Eliminación de clientes
* 🔐 Login de usuario
* 🌐 Versión web

---

## 📦 Producto

* Proyecto Java (NetBeans)
* Base de datos MySQL
* Archivo .JAR exportado

---

## ✅ Estado del proyecto

✔ Funcional
✔ Conectado a base de datos
✔ Listo para uso básico

---

## 👨‍💻 Autor

Abraham Villalobos Almonten  Proyecto desarrollado con fines educativos.

---

