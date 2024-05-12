let http = require('http');
const port = 3000;
const express = require('express');
const app = express();
const path = require('path');
const bodyParser = require("body-parser");

app.use(bodyParser.json());
app.use(express.json());

app.use(express.static(path.join(__dirname, 'public_files')));

app.get('/home', (req, res) => {
  res.sendFile(path.join(__dirname, 'public_files', 'home.html'));
});

app.listen(port, () => {
  console.log(`A szerver fut a http://localhost:${port} címen`);
});