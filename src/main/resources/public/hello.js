/**
 * Created by harisghauri on 2/16/2017.
 */

$(document).ready(function() {
    $.ajax({
        url: "/buddies/1"
    }).then(function(data) {
        $('.buddy-name').append(data.name);
        $('.buddy-address').append(data.address);
    });
});
