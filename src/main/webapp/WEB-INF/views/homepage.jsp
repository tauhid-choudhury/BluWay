<div>
<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li ng-repeat="movie in topMovies" data-target="#carousel-example-generic" data-slide-to="$index" ng-class='{active:$first}'></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner" role="listbox">
    <div ng-repeat="movie in topMovies" class="item itemSlide" ng-class='{active:$first}'>
     <img ng-src="resources/images/{{movie}}.jpg" alt="Description" class="featuredImages" />
    </div> 
  </div>

  <!-- Controls -->
  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
</div>


<div>


<div class="panel panel-default panel-custom">
  <div class="panel-heading">
    <h3 class="panel-title">Panel title</h3>
  </div>
  <div class="panel-body">
    <div class="movieList">
    <ul class="list-inline list-in">
        <li class="movieItem">
            <span>Test Data1</span>
        </li>
        <li class="movieItem">
            <span>Test Data1</span>
        </li>
        <li class="movieItem">
            <span>Test Data1</span>
        </li>
        <li class="movieItem">
            <span>Test Data1</span>
        </li>
        <li class="movieItem">
            <span>Test Data1</span>
        </li>
        <li class="movieItem">
            <span>Test Data1</span>
        </li>
        <li class="movieItem">
            <span>Test Data1</span>
        </li>
        <li class="movieItem">
            <span>Test Data1</span>
        </li>
        <li class="movieItem">
            <span>Test Data1</span>
        </li>
    </ul>
</div>
  </div>
</div>



</div>