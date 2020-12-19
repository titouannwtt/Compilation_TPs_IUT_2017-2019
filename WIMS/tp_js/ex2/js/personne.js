function Personne(nom,prenom,mail,age,amis){
	this.nom=nom||"";
	this.prenom=prenom||"";
	this.mail=mail||"";
	this.age=age||0;
	this.amis=amis||[];
}

var Denis=new Personne("Monnerat","Denis","monnerat@u-pec.fr",44);
var Pierre=new Personne("Valarcher","Pierre","valarcher@u-pec.fr",49);
var Didier=new Personne("Diaz","Didier","diaz@u-pec.fr",53);
var Luc=new Personne("Hernandez","Luc","hernandez@u-pec.fr",44);
var DeptInfo = [];
DeptInfo.push(Denis,Luc,Pierre,Didier);
DeptInfo.sort((a,b)=>{
	return b.age-a.age;
});
DeptInfo = DeptInfo.map(p => {
p.nom = 	p.nom.toUpperCase();
	return p;
	
});
Personne.prototype.toHtmlRow=function(){
	return "<tr>"
			+"<td>"+this.nom+"</td>"
			+"<td>"+this.prenom+"</td>"
			+"<td>"+this.mail+"</td>"
			+"<td>"+this.age+"</td>"
			+"</tr>";
}

function AfficherTable(personnes){

document.writeln("<table class='_b1'><thead><th>Nom</th><th>Prénom</th><th>Mail</th><th>Age</th></thead>");
document.writeln("<tbody>");
	personnes.forEach(function(p){
		document.writeln(p.toHtmlRow());
		
	})
	document.writeln("</tbody></table>");

//document.writeln("<p>Age Moyen : "+age.toFixed(2)+"</p>");
}
