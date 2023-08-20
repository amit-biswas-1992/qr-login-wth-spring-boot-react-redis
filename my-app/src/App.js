import logo from './logo.svg';
import './App.css';
import QRCode from "react-qr-code";
import { useEffect, useState } from 'react';
import { v4 as uuidv4 } from 'uuid';



function App() {

  const [uuid, setUuid] = useState("");

  const generateUUID = () => {
    const uuid =uuidv4();
    setUuid(uuid);
  }

  useEffect(() => {
    generateUUID();
  }
  ,[]);

  return (
    <div className="App">
      <header className="App-header">
        <p>
           <code>QR Login Project</code>
        </p>
        <QRCode value={uuid} />
       
      </header>
    </div>
  );
}

export default App;
