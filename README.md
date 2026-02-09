# 🚀 SpeedFast — Simulación Concurrente de Pedidos (Java)

## 📌 Descripción

Este proyecto corresponde a una simulación en consola para la empresa **SpeedFast**, que modela la gestión y entrega de pedidos utilizando **Programación Orientada a Objetos (POO)** y **programación concurrente en Java**.

El sistema simula múltiples repartidores trabajando **en paralelo** sobre una **zona de carga compartida**, asegurando que cada pedido sea retirado y entregado por un único repartidor, evitando condiciones de carrera.

---

## 🧠 Conceptos aplicados

El proyecto aplica los siguientes conceptos:

### 🔹 Programación Orientada a Objetos

* Herencia
* Polimorfismo
* Abstracción
* Sobrecarga y sobrescritura de métodos
* Uso de interfaces
* Encapsulamiento

### 🔹 Programación Concurrente

* Uso de `Runnable`
* Gestión de hilos con `ExecutorService`
* Recurso compartido protegido con `BlockingQueue`
* Sincronización de acceso a pedidos
* Control de estados del pedido mediante `enum`

---

## 🎯 Funcionalidades principales

### ✅ Tipos de pedidos implementados

* **PedidoComida**

  * Asignación automática de repartidor
  * Cálculo de tiempo estimado de entrega

* **PedidoEncomienda**

  * Asignación manual de repartidor (sobrecarga)
  * Cálculo de tiempo estimado de entrega

* **PedidoExpress**

  * Permite cancelar pedidos
  * Evita el despacho si el pedido se encuentra cancelado

---

### 🚚 Simulación concurrente de entregas

* Los pedidos ingresan a una **Zona de Carga compartida**
* Múltiples repartidores trabajan **en paralelo**
* Cada pedido cambia de estado:

  * `PENDIENTE` → `EN_REPARTO` → `ENTREGADO`
* El sistema garantiza que:

  * No existan pedidos duplicados
  * No se produzcan errores de concurrencia
  * Cada pedido sea entregado una sola vez

---

## 🧩 Estructura del proyecto

📁 `src/cl/speedfast/`

* `Main.java` → Simulación secuencial (versión inicial)
* `MainConcurrente.java` → Simulación concurrente (Semana 5)
* `Pedido.java` → Clase base abstracta
* `EstadoPedido.java` → Enum de estados del pedido
* `PedidoComida.java` → Clase hija
* `PedidoEncomienda.java` → Clase hija
* `PedidoExpress.java` → Clase hija
* `Despachable.java` → Interfaz
* `Cancelable.java` → Interfaz
* `Rastreable.java` → Interfaz

📁 `src/cl/speedfast/concurrente/`

* `ZonaDeCarga.java` → Recurso compartido sincronizado
* `Repartidor.java` → Hilo que ejecuta entregas concurrentes

---

## 🖥️ Ejecución del programa

### ▶️ Ejecución recomendada (concurrencia)

Ejecutar la clase:

```
cl.speedfast.MainConcurrente
```

### 📄 Ejemplo de salida esperada

```txt
== SpeedFast | Simulación Concurrente ==
Pedido #201 agregado. Destino: Santiago Centro
Pedido #202 agregado. Destino: Providencia
Pedido #203 agregado. Destino: Ñuñoa

[Repartidor - Juan] Retirando pedido #201 | Destino: Santiago Centro
[Repartidor - Camila] Retirando pedido #202 | Destino: Providencia
[Repartidor - Pedro] Retirando pedido #203 | Destino: Ñuñoa

[Repartidor - Camila] Pedido #202 ENTREGADO | Destino: Providencia
[Repartidor - Juan] Pedido #201 ENTREGADO | Destino: Santiago Centro
[Repartidor - Pedro] Pedido #203 ENTREGADO | Destino: Ñuñoa

Todos los pedidos han sido entregados correctamente
```

> El orden de ejecución puede variar, lo cual evidencia la concurrencia del sistema.

---

## ⚙️ Requisitos

* **Java JDK 17+** (recomendado JDK 21 o JDK 24)
* IntelliJ IDEA (recomendado)

---

## 🛠️ Cómo ejecutar en IntelliJ IDEA

1. Abrir el proyecto en IntelliJ IDEA
2. Verificar que la carpeta `src` esté marcada como **Sources Root**
3. Ejecutar la clase `MainConcurrente`
4. Observar la salida concurrente en consola

---

📌 **Proyecto académico — Desarrollo Orientado a Objetos II
Semana 5 — Programación Concurrente (SpeedFast)**

---
