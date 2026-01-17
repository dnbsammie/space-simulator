# Ikonli – Sistema de Iconos de SpaceSimulator

Este proyecto utiliza Ikonli para manejar iconos vectoriales mediante fuentes.
No se almacenan archivos de iconos físicos: todos los iconos se cargan dinámicamente
a través de los packs incluidos en el pom.xml.

Packs utilizados:
- Material Design Icons (mdi)
- FontAwesome 5 (fa)

Regla:
Siempre que se necesite un icono, primero debe añadirse a esta lista para mantener
consistencia visual y semántica en la interfaz.

---

## Iconos definidos

| Uso funcional            | Icono Ikonli        | Pack | Literal              |
|--------------------------|---------------------|------|----------------------|
| Cohete / Nave            | Rocket              | MDI  | mdi-rocket           |
| Fuego / Propulsión       | Fire                | MDI  | mdi-fire             |
| Planeta / Destino        | Planet               | MDI  | mdi-planet           |
| Ciencia / Recursos       | Probeta / Flask     | FA   | fa-flask             |
| Advertencia / Peligro    | Warning             | MDI  | mdi-alert            |
| Búsqueda / Inspección    | Lupa                | FA   | fa-search            |
| Radar / Sensores         | Radar               | MDI  | mdi-radar            |
| Energía / Electricidad   | Rayo                | FA   | fa-bolt              |
| Seguridad / Bloqueo      | Candado             | FA   | fa-lock              |

---

## Uso en FXML

Ejemplo:

```xml
<FontIcon iconLiteral="mdi-rocket"/>
<FontIcon iconLiteral="fa-lock"/>
```

Propiedades adicionales:

```xml
<FontIcon iconLiteral="mdi-alert" iconSize="24"/>
```

Uso en java:

```java
    FontIcon icon = new FontIcon("mdi-planet");
    icon.setIconSize(20);
```
## Convenciones Visuales

- MDI se usa para iconografía “espacial” y técnica.
- FontAwesome se usa para iconos abstractos y de UI general.
- No mezclar estilos dentro de un mismo panel si no es estrictamente necesario.
- Los iconos representan conceptos, no decoraciones.