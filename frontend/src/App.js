import './index.css'
import React from 'react'
import {
  LineChart,
  Line,
  XAxis,
  YAxis,
  CartesianGrid,
  Tooltip,
  Legend,
} from 'recharts'

const data = [
  {
    sensor_id: 'xxxx',
    date: '2018-12-01 10:20:12',
    data_value: '35',
  },
  {
    sensor_id: 'xxxx',
    date: '2018-12-01 10:20:12',
    data_value: '35',
  },
  {
    sensor_id: 'xxxx',
    date: '2018-12-01 10:20:12',
    data_value: '33',
  },
  {
    sensor_id: 'xxxx',
    date: '2018-12-01 10:20:12',
    data_value: '29',
  },
  {
    sensor_id: 'xxxx',
    date: '2018-12-01 10:20:12',
    data_value: '30',
  },
  {
    sensor_id: 'xxxx',
    date: '2018-12-01 10:20:12',
    data_value: '31',
  },
  {
    sensor_id: 'xxxx',
    date: '2018-12-01 10:20:12',
    data_value: '32',
  },
]

export default function App() {
  return (
    <div>
      <LineChart
        width={900}
        height={600}
        data={data}
        margin={{
          top: 50,
          right: 50,
          left: 50,
          bottom: 50,
        }}
      >
        <CartesianGrid strokeDasharray="3 3" />
        <XAxis dataKey="date" />
        <YAxis />
        <Tooltip />
        <Legend />
        <Line
          type="monotone"
          dataKey="data_value"
          stroke="#82ca9d"
          activeDot={{ r: 8 }}
        />
        {/* <Line type="monotone" dataKey="uv" stroke="#82ca9d" /> */}
      </LineChart>
    </div>
  )
}
