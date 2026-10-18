# Ejercicio 7: CalculadoraPromocion

## 🧠 Explicación Lógica
1. **Sobrecarga (Overloading):** Se implementaron tres métodos compartiendo el mismo nombre `calcularPrecioFinal` pero diferenciándose en su firma (cantidad y tipos de parámetros).
2. **Resolución Estática:** La JVM determina en tiempo de compilación cuál método invocar según la lista de argumentos suministrados en la llamada (un `double`, dos `double`, o un `double` y un `int`).
3. **Flexibilidad:** Permite calcular precios finales aplicando descuento base, descuento porcentual personalizado o cupón fijo sin duplicar nombres de métodos.