<div class="container">
    <div class="row">

        <div class="col-md-offset-2 col-md-8">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h4>Product</h4>
                </div>
                <div class="panel-body">
                    <form class="form-horizontal">

                        <div class="form-group">
                             <label class="control-label col-md-4" for="name">Enter Product Name</label>
                                    <div class="col-md-8">
                                        <input type="text" name="name" id="name" placeholder="Name" class="form-control"/>
                                    </div>
                        </div>

                        <div class="form-group">
                            <label class="control-label col-md-4" for="brand">Enter Product Name</label>
                                <div class="col-md-8">
                                    <input type="text" name="brand" id="brand" placeholder="Brand Name" class="form-control"/>
                                    <em class="help-block">Please enter brand name</em>
                                </div>
                        </div>

                        <div class="form-group">
                                <label class="control-label col-md-4" for="description">Product Description</label>
                                    <div class="col-md-8">
                                         <textarea name="description" id="description" rows="4" placeholder="Write a description"></textarea>
                                    </div>
                        </div>

                        <div class="form-group">
                              <label class="control-label col-md-4" for="unitPrice">Enter Unit Price</label>
                                    <div class="col-md-8">
                                         <input type="number" name="unitPrice" id="unitPrice" rows="4" placeholder="Unit Price in &euro;"/>
                                    </div>
                        </div>

                        <div class="form-group">
                            <label class="control-label col-md-4" for="quantity">Quantity Available</label>
                            <div class="col-md-8">
                                <input name="number" name="quantity" id="quantity" placeholder="Quantity Available"/>
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="control-label col-md-4" for="categoryId">Select Category</label>
                            <div class="col-md-8">
                                <select class="form-control" id="categoryId" name="categoryId">
                                    <option value="1">Category One</option>
                                    <option value="2">Category Two</option>
                                </select>
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="col-md-offset-4 col-md-8">
                                <input type="submit" name="submit" id="submit" value="submit" class="btn btn-primary"/>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>