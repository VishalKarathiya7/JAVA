# To Do List Backend

## API Docs

**GET** `/tasks`
Get the list of all tasks
```json
{
  {
    "id": 1,
    "title": "Payment of light bill",
    "due_date": 20220205,
    "completed": false,
  },
  {
    "id": 2,
    "title": "Payment of EMI",
    "due_date": 20220205,
    "completed": false,
  }
}
```
**GET** `/tasks/{id}`
Get task by id
```json
{
    "id": 1,
    "title": "Payment of light bill",
    "due_date": 20220205,
    "completed": false,
}
```
## Entities
