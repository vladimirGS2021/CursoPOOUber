class User extends Account {

    public function construct($name,
    $document, $email, $password) {
    parent::_construct($name, $document, $email, $password); }
    
    public function printDataUser() {
    echo "User";
    echo"<br>";
    echo "Name: $this->name
    Document: $this->document
    E-mail:$this->email
    Password: $this->password";
    echo "<br>";