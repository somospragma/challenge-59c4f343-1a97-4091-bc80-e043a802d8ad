# Implementación de un protocolo de comunicación en tiempo real para un sistema de chat

Tu tarea es implementar un protocolo de comunicación en tiempo real para un sistema de chat. El sistema debe permitir a los usuarios enviar y recibir mensajes de manera instantánea. Es importante que el sistema sea escalable y maneje múltiples usuarios simultáneamente.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Protocolos de comunicación no convencionales |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 3-4 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Diseño del protocolo

**Objetivo:** Definir las reglas y el flujo de comunicación para el protocolo de chat en tiempo real.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Identifica los componentes clave del sistema (usuarios, mensajes, servidor).
- Define el formato de los mensajes y las reglas de comunicación.
- Establece cómo se manejarán las conexiones y desconexiones de los usuarios.

**Entregable:** Un documento que describa el protocolo de comunicación, incluyendo el formato de los mensajes y las reglas de comunicación.

<details>
<summary>Pistas de conocimiento</summary>

- Considera la latencia y la escalabilidad al definir el protocolo.
- Piensa en cómo manejarías la concurrencia de múltiples usuarios.

</details>

### Fase 2: Implementación del servidor

**Objetivo:** Crear un servidor que pueda manejar las conexiones de los usuarios y enviar/recibir mensajes en tiempo real.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Implementa un servidor que acepte conexiones de los usuarios.
- Define cómo el servidor manejará los mensajes entrantes y salientes.
- Asegúrate de que el servidor pueda manejar múltiples conexiones simultáneamente.

**Entregable:** Un servidor funcional que pueda manejar las conexiones de los usuarios y enviar/recibir mensajes en tiempo real.

<details>
<summary>Pistas de conocimiento</summary>

- Considera usar un modelo de concurrencia adecuado para manejar múltiples conexiones.
- Piensa en cómo optimizarías la comunicación para reducir la latencia.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es un protocolo de comunicación en tiempo real y por qué es importante en un sistema de chat?
- **paraQueSirve**: ¿Para qué sirve el protocolo que diseñaste en la primera fase?
- **comoSeUsa**: ¿Cómo usaste el protocolo para implementar el servidor en la segunda fase?
- **erroresComunes**: ¿Qué errores comunes podrías encontrar al implementar un protocolo de comunicación en tiempo real?

## Criterios de Evaluacion

- Definir un protocolo de comunicación en tiempo real para un sistema de chat.
- Implementar un servidor que pueda manejar las conexiones de los usuarios y enviar/recibir mensajes en tiempo real.
- Identificar y manejar errores comunes en la implementación del protocolo.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
