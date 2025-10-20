import React from 'react';

interface Habit {
  id: number;
  name: string;
  description: string;
  startDate: string;
  completed: boolean;
}

const habit: Habit = {
  id: 1,
  name: 'Correr 30 min',
  description: 'Ejercicio diario',
  startDate: '2025-10-21',
  completed: false
};

function App() {
  return (
    <div>
      <h1>Hábito: {habit.name}</h1>
      <p>{habit.description}</p>
    </div>
  );
}

export default App;
