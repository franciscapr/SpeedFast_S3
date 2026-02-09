# 🚀 SpeedFast S3 — Simulación de Pedidos (Java)

## 📌 Descripción

Este proyecto corresponde a una simulación en consola para la empresa **SpeedFast**, que permite gestionar distintos tipos de pedidos y mostrar su historial de entregas.

El sistema trabaja con **Programación Orientada a Objetos (POO)** aplicando:

* **Herencia**
* **Polimorfismo**
* **Sobrecarga y sobrescritura de métodos**
* **Interfaces**
* **Listas dinámicas (ArrayList)**

---

## 🎯 Funcionalidades principales

### ✅ Tipos de pedidos implementados

* **PedidoComida**

  * Asignación automática de repartidor
  * Cálculo de tiempo estimado
  * Despacho del pedido

* **PedidoEncomienda**

  * Asignación manual de repartidor (sobrecarga)
  * Cálculo de tiempo estimado
  * Despacho del pedido

* **PedidoExpress**

  * Permite cancelar pedidos
  * Evita el despacho si el pedido está cancelado

---

## 🧩 Estructura del proyecto

📁 `src/cl/speedfast/`

* `Main.java` → Ejecuta la simulación completa
* `Pedido.java` → Clase base (superclase)
* `PedidoComida.java` → Clase hija
* `PedidoEncomienda.java` → Clase hija
* `PedidoExpress.java` → Clase hija
* `Despachable.java` → Interfaz para despachar pedidos
* `Cancelable.java` → Interfaz para cancelar pedidos
* `Rastreable.java` → Interfaz para visualizar historial

---

## 🖥️ Ejecución del programa

### ▶️ Ejemplo de salida esperada

```txt
== Sistema SpeedFast | Simulacion de Pedidos ==

PEDIDO DE COMIDA

Pedido #101
Direccion: Calle 5 Norte 123
Distancia: 4.0 km
Repartidor asignado: Luis Miguel
Tiempo estimado: 23 minutos
Pedido despachado correctamente.

---------------------------------

PEDIDO ENCOMIENDA

Pedido #102
Direccion: Av. Santa Rosa 567
Distancia: 7.0 km
Repartidor asignado: Daniela Tapia
Tiempo estimado: 31 minutos
Pedido despachado correctamente.

---------------------------------

Cancelando Pedido Express #103...
-> Pedido cancelado exitosamente.

---------------------------------

Historial:
- PedidoComida #101 entregado por Luis Miguel
- PedidoEncomienda #102 entregado por Daniela Tapia

Intentando despachar Pedido Express cancelado #103...
No se puede despachar: el pedido esta cancelado.

== Fin de la simulacion ==
```

---

## ⚙️ Requisitos

* **Java JDK 17+** (recomendado JDK 21 o JDK 24)
* IntelliJ IDEA o NetBeans

---

## 🛠️ Cómo ejecutar en IntelliJ IDEA

1. Abrir el proyecto desde IntelliJ
2. Verificar que `src` esté marcado como **Sources Root**
3. Abrir `Main.java`
4. Ejecutar con botón ▶️ Run

---

📌 Proyecto académico — Semana 3 (SpeedFast)
