# FitFlow

FitFlow es una plataforma web centrada en la gestión de hábitos con enfoque fitness-salud, con un asistente inteligente neutral y profesional que sugiere rutinas personalizadas, analiza progreso y motiva al usuario.

## Objetivo

El objetivo de FitFlow es reunir mis conocimientos fullstack e inteligencia artificial en un proyecto ambicioso para mi portfolio. La fase inicial será un MVP funcional orientado solo a la web.

## Fases del proyecto

1. Fase 0: Preparación (estructura, Docker, configuraciones básicas)  
2. Fase 1: MVP — autenticación, CRUD de hábitos, registro diario, dashboard básico, asistente rule-based  
3. Fase 2: IA intermedia — recomendaciones basadas en clustering / similitud  
4. Fase 3: Chatbot motivacional (NLP ligero)  
5. Fase 4: Extensiones: social, wearables, app móvil, fine-tuning ML

## Cómo arrancar

Por ahora solo hay configuraciones básicas. En la Fase 1 se agregará cómo levantar frontend, backend y servicio IA con Docker Compose.

```bash
git clone https://github.com/galindojoan/fitflow.git
cd fitflow
docker-compose up
