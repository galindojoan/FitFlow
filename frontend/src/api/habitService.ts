import { API_BASE_URL } from './config';

export interface Habit {
  id?: number;
  name: string;
  description: string;
  startDate: string;
  completed: boolean;
}

// GET todos los hábitos
export const getHabits = async (): Promise<Habit[]> => {
  const res = await fetch(`${API_BASE_URL}/habits`);
  return res.json();
};

// POST nuevo hábito
export const createHabit = async (habit: Habit): Promise<Habit> => {
  const res = await fetch(`${API_BASE_URL}/habits`, {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(habit)
  });
  return res.json();
};

// PUT actualizar hábito
export const updateHabit = async (id: number, habit: Habit): Promise<Habit> => {
  const res = await fetch(`${API_BASE_URL}/habits/${id}`, {
    method: 'PUT',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(habit)
  });
  return res.json();
};

// DELETE hábito
export const deleteHabit = async (id: number): Promise<void> => {
  await fetch(`${API_BASE_URL}/habits/${id}`, { method: 'DELETE' });
};
