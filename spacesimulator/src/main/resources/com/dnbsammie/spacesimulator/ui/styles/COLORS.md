# 🎨 Guía de Colores – Space Simulator

Este documento sirve como referencia para los colores oficiales del proyecto.  
La idea es mantener consistencia en la interfaz y facilitar la colaboración entre los miembros del equipo.

---

## 📌 Menu Principal

| Nombre               | Color HEX | Uso recomendado                      |
|----------------------|-----------|--------------------------------------|
| **Texto Primario**   | `#FAFAFA` | Títulos Gigantes / Botones inactivos |
| **Texto Secundario** | `#dcdcdc` | Subtítulos / Parrafos                |
| **Botón Activo**     | `#4af4f1` | Hover                                |
| **Fondo**            | `#131313` | Background general                   |
| **Acentos**          | `#1e428b` | Texto principal                      |

---

## 🖌️ Ejemplo de uso en JavaFX CSS

```css
/* Botón primario */
.button-primary {
    -fx-background-color: #XXXXXX;
    -fx-text-fill: #FFFFFF;
}

/* Texto de alerta */
.label-danger {
    -fx-text-fill: #XXXXXX;
}

/* Otras opciones */
.ejemplo {
    -fx-color: transparent;
    -fx-color: hsla(200, 70%, 50%, 1);
    -fx-color: rgba(45, 137, 239, 0.8);
}