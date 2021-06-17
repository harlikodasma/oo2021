let error = document.querySelector("#error");
let koikvormid = document.querySelector("#koikvormid");
let algvormid = document.querySelector("#algvormid");
let popular = document.querySelector("#popular");
let tekst = document.querySelector("#tekst");
let continueButton = document.querySelector("#continue");
let preSubmit = document.querySelector("#preSubmit");
let postSubmit = document.querySelector("#postSubmit");
let tabel = document.querySelector("#tabel");
let sonadearv = {};
let sonadeprotsent = {};
let vahendatud = [];

postSubmit.style.display = "none";

continueButton.addEventListener("click", function() {
    if((!(koikvormid.checked) && !(algvormid.checked)) || tekst.value == "") {
        error.innerHTML = "Valikud tegemata!";
    } else {
        error.innerHTML = "";
        koguTekst = tekst.value.toLowerCase();
        
        const reg = /[^a-zA-Z õäöüÕÄÖÜ]/g;
        koguTekst = koguTekst.replaceAll(reg, " ");
        koguTekst = koguTekst.split("     ").join(" ").split("    ").join(" ").split("   ").join(" ").split("  ").join(" ").split(" ");

        preSubmit.style.display = "none";
        postSubmit.style.display = "block";

        var jsonString = JSON.stringify(koguTekst);
        if(algvormid.checked) {
            $.ajax({
                type: "POST",
                url: "lemma.php",
                data: {data : jsonString},
                success: function(data){
                    postSubmit.innerHTML = data;
                }
            });
        } else {
            koguTekst.forEach(function(element) {
                if(element in sonadearv) {
                    sonadearv[element] += 1;
                } else {
                    sonadearv[element] = 1;
                }
            });
    
            koguTekst.forEach(function(element) {
                num = (sonadearv[element] * 100) / koguTekst.length;
                sonadeprotsent[element] = Math.round((num + Number.EPSILON) * 100) / 100;
            });
    
            sorteeritud = sort_object(sonadearv);

            if(popular.checked) {
                elemente = Object.keys(sorteeritud).length;
                vajalikarv = elemente * 0.2;
                for(let i = 0; i < vajalikarv; i++) {
                    vahendatud.push(Object.keys(sorteeritud)[i]);
                }
                for(let i = 0; i < vahendatud.length; i++) {
                    tabel.innerHTML += "<tr><th>" + vahendatud[i] + "</th><th>" + Object.values(sorteeritud)[i] + "</th><th>" + sonadeprotsent[Object.keys(sorteeritud)[i]] + "%</th></tr>";
                }
            } else {
                for(let i = 0; i < Object.keys(sorteeritud).length; i++) {
                    tabel.innerHTML += "<tr><th>" + Object.keys(sorteeritud)[i] + "</th><th>" + Object.values(sorteeritud)[i] + "</th><th>" + sonadeprotsent[Object.keys(sorteeritud)[i]] + "%</th></tr>";
                }
            }
        }
    }
});

//copytud: https://stackoverflow.com/questions/25500316/sort-a-dictionary-by-value-in-javascript
function sort_object(obj) {
    items = Object.keys(obj).map(function(key) {
        return [key, obj[key]];
    });
    items.sort(function(first, second) {
        return second[1] - first[1];
    });
    sorted_obj={}
    $.each(items, function(k, v) {
        use_key = v[0]
        use_value = v[1]
        sorted_obj[use_key] = use_value
    })
    return(sorted_obj)
}

//tekst lmao
// let re1 = new RegExp("[^a-zA-Z]", " ");