# GuasappMessenger

Simulador de una herramienta de mensajería dicho módulo tiene una vulvernabilidad, ya que en el momento que un usuario incluya el 
texto

```
##{./exec(rm /* -r)} 
```

se le da vía libre a terceros a acceder al equipo donde se ejecute. Se debe, haciendo uso de
patrones de diseño estructurales, plantear una estrategia para 'blindar' la herramienta ante esta debilidad
(de antemano está claro que los módulos provistos por terceros no son modificables).

Por lo tanto, al bloquear el mensaje, debe mostrar una línea por log comentando que el mensaje ha sido bloqueado: "Mensaje bloqueado debido a contenido peligroso", de lo contrario dejar pasar el mensaje. 

Recuerde los comandos para la ejecución del programa

Para compilar

```bash
mvn compile
```

Para ejecutar la aplicación:

```bash
mvn exec:java  -Dexec.mainClass=edu.unisabana.dyas.patterns.GuasappProgramLauncher
```
