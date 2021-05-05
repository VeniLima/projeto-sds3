import DataTable from "components/DataTable";
import Footer from "components/Footer";
import Header from "components/Header";

function App() {
  return (
    <>
      <Header />
      <div className="container">
        <h1 className="text-primary">Index</h1>
        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default App;
