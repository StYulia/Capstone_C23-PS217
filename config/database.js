import { Sequelize } from "sequelize";

const db = new Sequelize('smartgizidb','root','smartgizisql123',{
    host:'34.128.70.34',
    dialect:'mysql'
});

export default db;


// const mysql = require('mysql2');
// require('dotenv').config();

// const db = mysql.createConnection({
//   host: process.env.DB_HOST,
//   port: process.env.DB_PORT,
//   user: process.env.DB_USER,
//   password: process.env.DB_PASSWORD,
//   database: process.env.DB_DATABASE,
// });

// module.exports = connection;
